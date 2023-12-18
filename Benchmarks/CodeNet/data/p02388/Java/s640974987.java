public class Main {
    public static void main(String args[]){
        if(args.length <= 0){
            return;
        }else{
            int x = Integer.parseInt(args[0]);
            System.out.println(x * x * x);
        }
        return;
    }
}
