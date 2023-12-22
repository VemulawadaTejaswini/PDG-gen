import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int[] Antennas= new int[5];
    boolean abc=false;
    for (int i = 0; i < 5; i++) {
      int Antenna=sc.nextInt();
      Antennas[i]=Antenna;
    }
    int Distanse=sc.nextInt();
   
    for(int i=0;i<4;i++){
      for(int j=1;j<5;j++){
        if(Math.abs(Antennas[i]-Antennas[j])>Distanse){
          abc=true;
        }
     }
  }
    if(abc==true){
      System.out.println(":(");
    }else{
      System.out.println("Yay!");
    }
}
}