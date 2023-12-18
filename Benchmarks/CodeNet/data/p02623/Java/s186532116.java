import java.util.Scanner;	//入力クラス(Scannerクラス)を取り込む

class SampleEx{
    public static void main( String[] args ) {
      Scanner sc = new Scanner(System.in); 
	  System.out.print("a棚個数"); 

      int a = sc.nextInt();
	  System.out.print("b棚個数"); 
      int b = sc.nextInt();
	  System.out.print("そう時間"); 
      int lim=sc.nextInt();
      int ac = 0;
      int bc = 0;
      int cou = 0;
      int tim =0;
      int[] ar = new int[a];
      int[] br = new int[b];
      for(int i = 0; i < a; i++){
      	ar[i]= sc.nextInt();
		}
      for(int i = 0; i < b; i++){
      	br[i]= sc.nextInt();
		}
      
 
      System.out.print("2");
    }
}