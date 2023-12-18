import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []cnt=new int[101];
		int i,max=0;
		while(sc.hasNextInt()){
			 int count=sc.nextInt();
			 cnt[count]++;
			 if(max<cnt[count])max=cnt[count];
		}
		for(i=0;i<cnt.length;i++){
			if(cnt[i]==max){System.out.println(i);}
		}
	}
}