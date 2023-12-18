import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        String text = sc.nextLine();
        
        String [] arr = new String[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            //input all elements of string to an array
            arr[i] = Character.toString(text.charAt(i));
            
            //convert the elements to UpperCase or LowerCase
            if (arr[i] == arr[i].toUpperCase()) {
               arr[i]= arr[i].toLowerCase();
            }else{
               arr[i]= arr[i].toUpperCase();
            }
            
            //Print the output
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}

