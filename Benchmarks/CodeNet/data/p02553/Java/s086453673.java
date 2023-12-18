import java.util.Scanner;

public class Main{
  public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
  long esu[];
  esu = new long[4];
    for(int i=0;i<4;i++){
        esu[i] = scanner.nextInt();   
   }

  long emu[];
  emu = new long[4];

    emu[0] = esu[0]*esu[2];
    emu[1] = esu[0]*esu[3];
    emu[2] = esu[1]*esu[2];
    emu[3] = esu[1]*esu[3];
    //System.out.println(emu[0]);


    long max = emu[0];
    for(int i=1;i<4;i++){
      if(emu[i]>max){
       max = emu[i];
      }
      else{
      }
    
    }

    
    
    
    
  System.out.println(max);
  }
}