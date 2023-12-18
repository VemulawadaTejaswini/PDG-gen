public class Main {
    public static void main (String[] args) {

         Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
         System.out.println((int) Math.pow(Integer.parseInt(s.nextInt()),3));
    }
}