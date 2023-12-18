public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lineA = br.readLine();
        String lineB = br.readLine();
         
        int a = Integer.parseInt(lineA);
        int b = Integer.parseInt(lineB);

        int ansA = a / b;
        int ansB = a % b;
        double ansC = a / b;
        
        System.out.println(ansA + " " + ansB + " " + ansC);
    }
} 