import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++){
			data[i]+=scan.nextInt();
		}
		System.out.println(load(data,0,new int[k]));
		scan.close();
	}
	private static int load(int[] data,int next,int[] track)
	{
		if(data.length<=next){
			/*if(max(track)==10){
				printTracks(track);
			}*/
			return max(track);
		}else{
			int min=Integer.MAX_VALUE;
			int w=0;
			for(int i=0;i<track.length;i++){
				int[] tmp=Arrays.copyOf(track, track.length);
				tmp[i]+=data[next];
				w=load(data,next+1,tmp);
				if(i==0){
					min=w;
				}else{
					if(w<min){
						min=w;
					}
				}
			}
			return min;
		}
	}
/*
	private static void printTracks(int[] track)
	{
		int sum=0;
		for(int i=0;i<track.length;i++){
			System.out.print(track[i]+" ");
			sum+=track[i];
		}
		System.out.print(sum);
		System.out.println();
	}
*/
	private static int max(int[] track)
	{
		int max=0;
		for(int i=0;i<track.length;i++){
			if(max<track[i]){
				max=track[i];
			}
		}
		return max;
	}
}