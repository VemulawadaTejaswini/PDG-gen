import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        int posA = 0;
        int posZ = 0;
        boolean foundPosA = false;
        for(int i=0; i<data.length(); i++) {
            if(data.charAt(i) == 'A' && !foundPosA) {
                posA = i;
                foundPosA = true;
            }else if(data.charAt(i) == 'Z'){
                posZ = i;
            }
        }

        String output = data.substring(posA,posZ+1);
        System.out.println(output.length());
    }
}
