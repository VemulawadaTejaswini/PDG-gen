import java.io.*;
 
class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
	String str[] = br.readLine().split(" ");

        for(int i = 0; i < count; i++) {

            if(i == count - 1) {
                System.out.println(str[count - i - 1]);
            } else {
                System.out.print(str[count - i - 1] + " ");
            }
        }
    }
}