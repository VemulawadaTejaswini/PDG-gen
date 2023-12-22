import java.io.*;
 class Main {
 public static void main(String[] args) throws IOException {
 BufferedReader br;
 br=new BufferedReader(new InputStreamReader(System.in));
String target=br.readLine();
//Scanner sc = new Scanner(br);
String[] moji = target.split(" ", 0);
int maisu = Integer.parseInt(moji[0]); 
int high = Integer.parseInt(moji[1]);
int wid = Integer.parseInt(moji[2]);
//List<String> kumi = new ArrayList<>();
int count = 0;
for (int i = 0 ; i < maisu ; i++){
      String line = br.readLine();
String[] awase = line.split(" ", 0);
int tate = Integer.parseInt(awase[0]); 
int yoko = Integer.parseInt(awase[1]);
if( tate >= high && yoko >= wid) {count++;}


    }
System.out.println(count);
 }
}