import java.util.Scanner;	//入力クラス(Scannerクラス)を取り込む

class SampleEx{
    public static void main( String[] args ) {
      Scanner sc = new Scanner(System.in); 
	

      int a = sc.nextInt();
	  
      int b = sc.nextInt();
	   
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
      
      while(true){
      	if(ar[ac] > br[bc]){
          tim +=ar[ac];
          ac+=1;
        }else{
          tim +=br[bc];
          bc+=1;
        }
        
        if(tim <= lim){
        	cou+=1;
        }else{
        	break;
        }
      }
      System.out.print(cou);
    }
}