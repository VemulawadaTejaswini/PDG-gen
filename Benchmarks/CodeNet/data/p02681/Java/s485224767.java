import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String id1 = br.readLine();
        String id2 = br.readLine();
        System.out.println(id1.length());
        System.out.println(id2.length());
        if(id1.length() != id2.length() -1) {
            System.out.println("No");
            return;
        }
        String subString = id2.substring(0,id2.length()-1);
        if(id1.equals(subString)){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}