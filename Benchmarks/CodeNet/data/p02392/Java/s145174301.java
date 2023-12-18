import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();
        
        System.out.println((a<b)&&(b<c)?"Yes":"No");
    }
}
