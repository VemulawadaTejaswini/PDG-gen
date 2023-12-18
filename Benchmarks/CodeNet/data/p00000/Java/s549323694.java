public class Main {
    public static void main(String[] args){
        for(int i=0;i<81;i++){
            int a = i/9+1;
            int b = i%9+1;
            int c = a*b;
            System.out.println(a+"x"+b+"="+c);
        }
    }
    
}