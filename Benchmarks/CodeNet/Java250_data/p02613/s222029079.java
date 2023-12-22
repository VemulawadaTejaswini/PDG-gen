import java.util.*;
    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] s = new String[n];
            for(int i=0; i<n; i++){
                s[i] = sc.next();
            }
            int c0=0;
            int c1=0;
            int c2=0;
            int c3=0;
            for(int i=0; i<n; i++){
            switch (s[i]){
              case "AC":
                    c0++;
                    break;
              case "WA":
                    c1++;
                    break;
              case "TLE":
                    c2++;
                    break;
              case "RE":
                    c3++;
                    break;
            }
            }
            System.out.println("AC x " + c0);
            System.out.println("WA x " + c1);
            System.out.println("TLE x " + c2);
            System.out.println("RE x " + c3);
            
        }
    }        
   