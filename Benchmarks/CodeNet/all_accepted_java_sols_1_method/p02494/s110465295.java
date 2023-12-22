import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  
  /*sc:for Scan from keyboard & H,W:Rectangle's height,width(max100000)*/
  Scanner sc=new Scanner(System.in);
  int[] H =new int[100000];
  int[] W =new int[100000];
  
  /*Default value of data-set of (H,W)*/
  int i=0;
  
  /*Use do-while because the 1st data-set must scan everytime*/
  do{
    H[i]=sc.nextInt();
    W[i]=sc.nextInt();
    i++;
  }while(H[i-1]!=0||W[i-1]!=0);  //Repeat until the last data-set (H,W)=(0,0)

  /*Output excluding the last data-set(0,0) ,so m<i-1*/
  for(int m=0;m<i-1;m++){
   int k,l;
   for(k=0;k<H[m];k++){
    for(l=0;l<W[m];l++){
     System.out.printf("#");
    }
    System.out.printf("\n");    //New line in one-rectangle (for expression width) 
   }
   System.out.printf("\n");     //New line for the interval between the two rectangle
  }
 }
}