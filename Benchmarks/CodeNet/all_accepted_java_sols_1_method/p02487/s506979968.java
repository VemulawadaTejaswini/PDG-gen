import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
  /*sc:for scan from keyboard ; H,W:for rectangle's height & width*/
  Scanner sc=new Scanner(System.in);
  int[] H =new int[100000];
  int[] W =new int[100000];
  
  /*Default value of data-set(H,W) No.*/
  int i=0;
 
  /*Use do-while because the 1st data-set must scan*/
  do{
    H[i]=sc.nextInt();
    W[i]=sc.nextInt();
    i++;
  }while(H[i-1]!=0||W[i-1]!=0);  //Repeat until the last data-set (H,W)=(0,0)

  for(int m=0;m<i-1;m++){
   int k,l;
   for(k=0;k<H[m];k++){
    for(l=0;l<W[m];l++){
     if(k==0||k==H[m]-1||l==0||l==W[m]-1)  //when k or l is at edge -> frame
      System.out.printf("#");  //expression frames
     else
      System.out.printf(".");  //expression the inner of frames
   }
   System.out.printf("\n");    //New line for expression rectangle's width
   }
  System.out.printf("\n");     //New line for interval between 2 rectangles
  }
 }
}