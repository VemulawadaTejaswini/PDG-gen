import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Ent = new Scanner(System.in);
        String pred = Ent.next();
        String actual = Ent.next();
        char arr1[] =  pred.toCharArray();
        char arr2[] =  actual.toCharArray();
        int numero = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i]){
                numero++;
            }
        }
        System.out.println(numero);
    }
}
