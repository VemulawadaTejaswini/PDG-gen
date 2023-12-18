import java.io.*;

class Main{
    public static void main(String args[]){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            String[] strArr = str.split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);

            if(a<b){
                System.out.println(a + "<" + b);
            }else if(a > b){
                System.out.println(a + ">" + b);
            }else{
                System.out.println(a + "=" + b);
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }

}