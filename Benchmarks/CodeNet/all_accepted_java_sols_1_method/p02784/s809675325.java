import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Integer numHP = sc.nextInt();
        Integer numHissatsu = sc.nextInt();
        sc.nextLine();
        
        int count = 0;
        int[] attackLine = new int[numHissatsu];
        while (sc.hasNext()) {
            int j = sc.nextInt();
            attackLine[count] = j;
            count++;
        }
        //String numAttack = sc.nextLine();
        
        sc.close();
        
        //List<String> attack = Arrays.asList(numAttack.split(""));
        
        String result = "No";
        
        for(int i = 0; i < numHissatsu; i++) {
            numHP = numHP - attackLine[i];
        }
        
        if(numHP <= 0) {
            result = "Yes";
        }
        
        System.out.println(result);
    }
}
