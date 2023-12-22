import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        String line1;
        while(true) {
            try {
                line = sc.nextLine();
                line1 = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            int[] a = new int[4];
            int[] b = new int[4];
            String[] A = line.split(" ");
            String[] B = line1.split(" ");
            int hit = 0;
            int blow = 0;
            for(int i = 0; i < 4; i++) {
                a[i] = Integer.parseInt(A[i]);
                b[i] = Integer.parseInt(B[i]);
            }
            
            for(int i = 0; i < 4; i++) {
                if(a[i] == b[i]) {
                    hit++;
                    continue;
                }
                for(int j = 0; j < 4; j++) {
                    if(a[i] == b[j]) {
                        blow++;
                        break;
                    }
                }
            }
            System.out.println(hit+" "+blow);
        }
    }
}
