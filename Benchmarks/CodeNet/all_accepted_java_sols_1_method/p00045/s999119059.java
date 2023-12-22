import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number;
        int sum =0,ave=0,a=0;
        while((number = bf.readLine())!=null){
            String []numbers = number.split(",");
            if (numbers.length!=2)break;
            int b =Integer.parseInt(numbers[0]);
            int c =Integer.parseInt(numbers[1]);
            a++;
            sum += b*c;
            ave += c;
            }
        System.out.println(sum);
        System.out.println(Math.round((double)ave/a));
        }
    }