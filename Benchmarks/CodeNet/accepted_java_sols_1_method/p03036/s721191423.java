import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();

        for(int i=0;i<10;i++){
            x = r*x - D;
            System.out.println(String.valueOf(x));
        }
    }
}