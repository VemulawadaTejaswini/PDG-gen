import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int notes =  Integer.valueOf(inputs[0]);
        int value = Integer.valueOf(inputs[1]);
        int maxOnes = value/1000;
        if(notes>maxOnes) {
            System.out.println("-1 -1 -1");
            return;
        }

        if(notes==maxOnes) {
            System.out.println("0 0 "+maxOnes);
            return;
        }

        int reduceNotes = maxOnes-notes;
        int maxTens = reduceNotes/9;
        int maxFives = reduceNotes/4;
        for(int i = 0 ; i<=maxTens ; i++ )
            for( int j = 0 ; j<=maxFives ;j++) {
                if ( i*9 + j*4 == reduceNotes) {
                    int onesLeft = maxOnes-(i*10)-(j*5);
                    if(onesLeft<0) {
                        continue;
                    }
                    System.out.println(i+" "+j+" "+onesLeft);
                    return;
                }
            }
        System.out.println("-1 -1 -1");
    }

}


