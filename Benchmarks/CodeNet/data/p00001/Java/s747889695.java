package hill;

import java.util.Scanner;
class Main{
public static void main(String[] args) throws Exception{
	int[] b = new int[10];
	Scanner scan = new Scanner(System.in);
	int first=0;
	int second=0;
	int third=0;
		
		for( int i=0;i<10;i++){
			b[i] = scan.nextInt();
		}
		
		for(int m=0;m<10;m++){
			if (b[m]>first){
				second=first;
				first=b[m];
			} else if (second < b[m] ){
				third = second;
				second= b[m];}
				else if (third < b[m]){
					third = b[m];
				}
			}
				System.out.println(first);
				System.out.println(second);
				System.out.println(third);
			}
		}
	
    