import java.util.Scanner;
 
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.next();
        int height = Integer.valueOf(inputValue);
        inputValue = scanner.next();
        int width = Integer.valueOf(inputValue);
        if(height < 1 || width > 100){
            System.out.println("input value error: " + inputValue);
            return;
        }
        int area = height * width;
        int circumference = (height * 2) + (width * 2);
        System.out.println(area + " " + circumference);
        return;
    }
}
