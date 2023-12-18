import java.io.*;
 
class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] iceCount = new int[10];
        int total;
        while (total != 0) {
            total = Integer.parseInt(br.readLine());
            for (int i = 0; i < total; i++) {
                int readValue = Integer.parseInt(br.readLine());
                iceCount[readValue]++;
            }
            
            for (int i = 0; i < iceCount.length; i++) {
                if (iceCount[i] <= 0) {
                    System.out.println("-");
                } else {
                    for (int j = 0; j < iceCount[i]; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            }
            iceCount = new int[10];
        }
    }
}