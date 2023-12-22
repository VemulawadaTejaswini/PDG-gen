import java.io.*;
 
class Main {
    static void call(int n){
        StringBuilder output = new StringBuilder();
        for(int i=3; i<=n; i++) {
            int x=i;
            if(x%3==0) {
                output.append(" "+i);
                continue;
            }
            do{
                if(x%10==3) {
                    output.append(" "+i);
                    break;
                }
                x/=10;
            }while(x!=0);
        }
        System.out.println(output);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        call(n);
    }
}