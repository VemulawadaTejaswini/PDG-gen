import java.util. *;


class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.next());
        int b = Integer.parseInt(input.next());
        
        if(a < b)
        {
            System.out.println("a < b");
        }
        else if(a > b)
        {
            System.out.println("a > b");
        }
        else{
            System.out.println("a == b");
        }
    }
}
