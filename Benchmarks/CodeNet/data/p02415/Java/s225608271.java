public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
           String line = sc.nextLine();
           String answer = "";
           int length = line.length();
           for(int i=0;i<length;i++){
              if(Character.isLowerCase(line.charAt(i))) {
                  answer += Character.toLowerCase(line.charAt(i));
              }else if(Character.isUpperCase(line.charAt(i))) {
                  answer += Character.toUpperCase(line.charAt(i));
              }else{
                  answer += line.charAt(i);
              }
           }
           System.out.println(answer);
        }
    }
}

