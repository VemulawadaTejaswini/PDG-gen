import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int PortA = sc.nextInt();
    int PortB = sc.nextInt();
    int PortC = sc.nextInt();
    int Time[]= new int[6];
    
    Time[0]=PortA+PortB;
    Time[1]=PortC+PortB;
    Time[2]=PortA+PortC;
    Time[3]=PortB+PortC;
    Time[4]=PortC+PortA;
    Time[5]=PortB+PortA;
   

	int max = Time[0];
	int min = Time[1];
for (int i = 1; i < Time.length; i++) {
    int v = Time[i];
    if (v > max) {
        max = v;
    }
    if (v < min) {
        min = v;
    }
}


System.out.println(min); 
  }
}

