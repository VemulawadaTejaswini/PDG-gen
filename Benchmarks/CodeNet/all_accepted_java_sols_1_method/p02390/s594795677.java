import java.util. *;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.next());
        int h = a/3600;
        a %= 3600;
        int m = a/60;
        a %= 60;
        System.out.println(h+":"+m+":"+a);      
    }
}
