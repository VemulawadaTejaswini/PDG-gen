import java.io.*;
class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String check = br.readLine();

int count = 0;
char[] eq = check.toCharArray();

while(true){
String str = br.readLine();
int space1 = 0;
int space2 = 0;

while(true){

if(str.equals("END_OF_TEXT"))
 break;
}

int eq_c = 0;

if(space1 == 0){
space2 = str.indexOf(" ");
String str1;
if(space2 != -1)
 str1 = str.substring(space1, space2);
else
 str1 = str.toString();

char[] eq1 = str1.toCharArray();

if(check.length() == str1.length()){
 for(int i = 0; i < check.length(); i++){
  if(eq[i] >= 'A' && eq[i] <= 'Z')
   if(eq[i] == eq1[i] || eq[i]+32 == eq1[i])
    eq_c++;
   else
    break;
  else if(eq[i] >= 'a' && eq[i] <= 'z')
   if(eq[i] == eq1[i] || eq[i]-32 == eq1[i])
    eq_c++;
   else
    break;
  else
   if(eq[i] == eq1[i])
    eq_c++;
 }
}

if(eq_c == check.length())
 count++;

if(space2 == -1) break;
space1 = space2;
}

else{
space1 = space2;
space2 = str.indexOf(" ", space2+1);
String str1;
if(space2 == -1){
 str1 = str.substring(space1+1, str.length());
}
else{
 str1 = str.substring(space1+1, space2);
}
char[] eq1 = str1.toCharArray();
if(check.length() == str1.length()){
 for(int i = 0; i < check.length(); i++){
  if(eq[i] >= 'A' && eq[i] <= 'Z')
   if(eq[i] == eq1[i] || eq[i]+32 == eq1[i])
    eq_c++;
   else
    break;
  else if(eq[i] >= 'a' && eq[i] <= 'z')
   if(eq[i] == eq1[i] || eq[i]-32 == eq1[i])
    eq_c++;
   else
    break;
  else
   if(eq[i] == eq1[i])
    eq_c++;
 }
}
if(eq_c == check.length())
 count++;
 if(space2 == -1)
  break;

}
}

System.out.println(count);

}
}