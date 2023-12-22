import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        String weather []={"Sunny","Cloudy", "Rainy"} ;
       // Vector v=new Vector();
        //String []w=new String [3];
        String today=cin.next();
        for(int i=0;i<2;i++){
            if(today.equals(weather[i])){
                System.out.println(weather[i+1]);
            }
        }
        if(weather[2].equals(today))
            System.out.println("Sunny");
        cin.close();
    }

}
