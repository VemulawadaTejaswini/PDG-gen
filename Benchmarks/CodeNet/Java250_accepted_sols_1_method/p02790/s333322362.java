import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if (a<=b){
            for (int i=0;i<b;i++){
                System.out.print(a);
            }
        }else if (a>b){
            for (int i=0;i<a;i++){
                System.out.print(b);
            }
        }
		sc.close();
		}

	}