public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        for (int c = 1; c < 10; c++){
            for (int d = 1; d < 10; d++){
                String c1 = String.valueOf(c);
                String d1 = String.valueOf(d);
                String e1 = String.valueOf(c*d);
                String f1 = c1 + "x" + d1 + "=" + e1;
                System.out.println(f1);
                
            }
        }
        
    }
}