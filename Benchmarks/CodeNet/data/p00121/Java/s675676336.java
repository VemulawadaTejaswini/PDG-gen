import java.util.Scanner;

public class Main {
    // void call(int n){
    //   int i = 1;
    //  CHECK_NUM:
    //   int x = i;
    //   if ( x % 3 == 0 ){
    //     cout << " " << i;
    //     goto END_CHECK_NUM;
    //   }
    //  INCLUDE3:
    //   if ( x % 10 == 3 ){
    //     cout << " " << i;
    //     goto END_CHECK_NUM;
    //   }
    //   x /= 10;
    //   if ( x ) goto INCLUDE3;
    //  END_CHECK_NUM:
    //   if ( ++i <= n ) goto CHECK_NUM;

    //   cout << endl;
    // }
    public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i = 1;
	do{
	    if ( i % 10 == 3 ){
		System.out.print(" " + i);
		break;
	    }
		
		
	}while (i % 3 != 0);
	System.out.print(" " + i);
	System.out.print("\n");
    }
}