import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            String str = br.readLine();
            String[] splited_Array = str.split(" ");
            System.out.println(Integer.parseInt(splited_Array[0])*Integer.parseInt(splited_Array[1]) + " " + 2*(Integer.parseInt(splited_Array[0])+Integer.parseInt(splited_Array[1])));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
