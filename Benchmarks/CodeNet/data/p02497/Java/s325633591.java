import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			int j;
			int ans;
				if(x!=-1&&y!=-1&&z!=-1){
					ans=x+y+z;
					if(ans>=80){
						System.out.println("A");
					}else if(65<=ans&&ans<80){
						System.out.println("B");
					}else if(50<=ans&&ans<65){
						System.out.println("C");
					}else if(30<=ans&&ans<50){
						System.out.println("D");
					}else{
						System.out.println("F");
					}
					}else{
						break;
					}
				}
			}
		}