public class Main {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                sb.append(i);
                sb.append('x');
                sb.append(j);
                sb.append('=');
                sb.append(i*j);
                sb.append('\r');
                sb.append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}