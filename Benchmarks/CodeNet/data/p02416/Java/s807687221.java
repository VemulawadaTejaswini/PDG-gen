import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) {
        char[] c=new char[1];
        int sum;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            while(true){
                sum=0;
                for(int i=0;i<str.length();i++){
                    str.getChars(i,i+1,c,0);
                    sum+=c[0]-'0';
                }
                System.out.println(sum);
                str=reader.readLine();
                if(str.equals("0"))break;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

