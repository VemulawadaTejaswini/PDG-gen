import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int rCount = 0;
        int lCount = 0;
        char nowChar = 'R';
        
        
        int val = 0;
        for (int z = 0; z < n; z++) {
            char c = str.charAt(z);
            if (nowChar == 'R') {
                if (c == 'R') {
                    rCount++;
                } else {
                    nowChar = 'L';
                    lCount++;
                }
            } else {
                if (c == 'R') {
                    for (int i = 0; i < rCount - 1; i++) {
                        System.out.print("0" + " ");
                    }
                    
                    val = (rCount + lCount) / 2;
                    if ((rCount + lCount) % 2 == 0) {
                        System.out.print(val + " " + val + " ");
                    } else {
                        if (rCount % 2 != 0) {
                            System.out.print((val+1) + " " + val + " ");
                        } else {
                            System.out.print(val + " " + (val+1) + " ");
                        }
                    }
                    
                    for (int i = 0; i < lCount - 1; i++) {
                        System.out.print("0" + " ");
                    }
                    
                    nowChar = 'R';
                    rCount = 1;
                    lCount = 0;
                } else {
                    lCount++;
                }
            }
        }
        
        
        for (int i = 0; i < rCount - 1; i++) {
            System.out.print("0" + " ");
        }
        
        val = (rCount + lCount) / 2;
        if ((rCount + lCount) % 2 == 0) {
            if (lCount >= 2) {
                System.out.print(val + " " + val + " ");
            } else {
                System.out.println(val + " " + val);
            }
        } else {
            if (rCount % 2 != 0) {
                if (lCount >= 2) {
                    System.out.print((val+1) + " " + val + " ");
                } else {
                    System.out.println((val+1) + " " + val);
                }
            } else {
                if (lCount >= 2) {
                    System.out.print(val + " " + (val+1) + " ");
                } else {
                    System.out.println(val + " " + (val+1));
                }
            }
        }
        
        if (lCount >= 2) {
            for (int i = 0; i < lCount - 2; i++) {
                System.out.print("0" + " ");
            }
            System.out.println("0");
        }
    }
}
