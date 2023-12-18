import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
  Scanner sc=new Scanner(System.in);
  int[] H =new int[100000];
  int[] W =new int[100000];
  
  int i=0;
 
  /*Use do-while because the 1st data set must scan everytime*/
  do{
    H[i]=sc.nextInt();
    W[i]=sc.nextInt();
    i++;
  }while(H[i-1]!=0||W[i-1]!=0);  //Repeat until the last data-set(H,W)=(0,0) 

  for(int m=0;m<i-1;m++){
   int k,l;
   for(k=0;k<H[m];k++){
    for(l=0;l<W[m];l++){
     
     if(k%2==l%2)   //when H&B->odd or H&B->even ,print"#".Other case print "."
      System.out.printf("#");
     else
      System.out.prinyfln(".");
    }
    System.out.printf("\n");    //New line for expression one chessbox's height
   }
   System.out.printf("\n");     //New line for interval between 2 chessbox
  }
 }
}