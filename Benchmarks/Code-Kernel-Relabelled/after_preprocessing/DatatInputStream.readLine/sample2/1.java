//11
public class func{
public void readLatinOneFileLines(File file){
    String str = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
   while ((str = infile.readLine()) != null)
    lines.addElement(str);
   infile.close();
}
}
