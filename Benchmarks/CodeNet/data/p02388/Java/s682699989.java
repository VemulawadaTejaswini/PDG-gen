public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext() ){
            String[] line = sc.nextLine().split(" ");
            int strnum = Integer.parseInt(line[0]);
            System.out.println(Math.pow(strnum,3));
        }
    }
}