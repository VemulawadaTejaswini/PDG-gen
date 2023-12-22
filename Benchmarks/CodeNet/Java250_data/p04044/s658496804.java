import java.util.*;


class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        List<String> array = new ArrayList<String>();
        int i = 0;

        while(i<=a){
          String c = scan.nextLine();
          array.add(c);
          i++;  
        }
        Collections.sort(array);
        i = 0;
        while(i<=a){
            System.out.print(array.get(i));
            i++;  
          }
        scan.close();
    }
}