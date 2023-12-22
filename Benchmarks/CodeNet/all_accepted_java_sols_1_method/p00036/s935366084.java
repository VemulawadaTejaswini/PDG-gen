import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int[] a=new int[8];
			for(int i=0;i<8;i++){
				a[i]=Integer.parseInt(sc.next(),2);
			}
			for(int i=0;i<8;i++){
				if(a[i]>0){
					if(i==7){
						System.out.println("C");
						break;
					}else if(a[i+1]==0){
						System.out.println("C");
						break;
					}else{
						if(a[i]==a[i+1]){
							if(i+2==8){
								System.out.println("A");
								break;
							}else{
								if(a[i]==a[i+2]){
									System.out.println("B");
									break;
								}else{
									System.out.println("A");
									break;
								}
							}
						}else if(a[i+1]==a[i]+a[i]*2){
							System.out.println("D");
							break;
						}else if(a[i]==a[i+1]*2){
							System.out.println("E");
							break;
						}else if(a[i+1]==a[i]+a[i]/2){
							System.out.println("F");
							break;
						}else{
							System.out.println("G");
							break;
						}
					}
				}
			}
		}
	}
}