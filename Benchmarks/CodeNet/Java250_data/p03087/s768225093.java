import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        String s = sc.next();
        int[] l = new int[q];
        int[] r = new int[q];
        for(int i = 0; i < q; i++){
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }
        
        int[] ac = new int[n];
        int count = 0;
        for(int i = 0; i < n-1; i++){
            if(s.charAt(i) == 'A' && s.charAt(i+1) == 'C'){
                count++;
            }
            ac[i+1] = count;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            sb.append(ac[r[i]-1] - ac[l[i]-1]).append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}