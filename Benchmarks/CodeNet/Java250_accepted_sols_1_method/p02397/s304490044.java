import java.io.*;
 class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader line = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ((str = line.readLine()) != null) {
            String[] arr = str.split(" ");
            if ("0".equals(arr[0]) && "0".equals(arr[1]))
                break;
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
 
            if (x > y)
                System.out.println(y + " " + x);
            else
                System.out.println(x + " " + y);
        }
    }
}