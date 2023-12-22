import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	if (s.equals("SSS")) System.out.print(0);
	else if (s.equals("SSR") || s.equals("SRS") || s.equals("RSS") || s.equals("RSR")) System.out.print(1);
	else if (s.equals("SRR") || s.equals("RRS")) System.out.print(2);
	else { System.out.print(3);}
    }
}
