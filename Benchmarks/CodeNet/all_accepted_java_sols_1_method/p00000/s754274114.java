public class Main {
 public static void main(String[] args) {
        
        int i = 1, j = 1;
        while(i<=9){
            for(j=1; j<=9; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
            i++;
        }
}
}