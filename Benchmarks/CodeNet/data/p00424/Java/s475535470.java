
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {


Scanner scan = new Scanner(System.in);
int a = scan.nextInt();


Map<String, String> map = new LinkedHashMap<>();

for(int i=0;i<a;i++){
String keychara = scan.next();
String valuechara = scan.next();
map.put(keychara, valuechara);
}


int b = scan.nextInt();

List<String> charalist=new ArrayList<>();
for(int i=0;i<b;i++){
String chara = scan.next();
charalist.add(chara);
}


for(String chara:charalist){
if(map.get(chara)==null){
System.out.print(chara);
}else{
System.out.print(map.get(chara));
}
}

}
}