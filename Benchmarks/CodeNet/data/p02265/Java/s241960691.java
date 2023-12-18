import java.util.*;
import java.io.*;
//fastest
class Main{
  static List dummy;

  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    StringBuilder builder = new StringBuilder();
    init();
    int i;
    for(i = n ; i>0; i--){
      String s = br.readLine();
      if(s.charAt(0)=='i'){
        insert(Integer.parseInt(s.substring(7)));
      }else if(s.charAt(6)=='F'){
        deleteFirst();
      }else if(s.charAt(6)=='L'){
        deleteLast();
      }else{
        delete(Integer.parseInt(s.substring(7)));
      }
    }
    List list = dummy.next;
    if(list != dummy){
      // System.out.printf("%d",list.data);
      builder.append(list.data);
      list = list.next;
    }
    while(list!=dummy){
      // System.out.printf(" %d",list.data);
      builder.append(' ').append(list.data);
      list = list.next;
    }
    System.out.println(builder);
    // Print_list();
  }
  static void init(){
    dummy = new List();
    dummy.next=dummy;
    dummy.previous=dummy;
  }
  //insert
  static void insert(int n){
    List list = new List(n);
    list.next=dummy.next;
    dummy.next.previous=list;
    dummy.next=list;
    list.previous=dummy;
  }
  //ノードの削除メソッド
  static void deleteNode(List delete){
    if( delete == dummy)return;
    delete.previous.next=delete.next;
    delete.next.previous=delete.previous;
  }
  //指定したノードの削除
  static void delete(int n){
    deleteNode(listSearch(n));
  }
  //firstnode削除
  static void deleteFirst(){
    deleteNode(dummy.next);
  }
  //lastnode削除
  static void deleteLast(){
    deleteNode(dummy.previous);
  }
  //keyを使ってノードを探索
  static List listSearch(int n){
    List cur = dummy.next;
    while(cur.data!=n && cur!=dummy){
      cur = cur.next;
    }
    return cur;
  }
  //printメソッド
  // static void Print_list(){
  //   List list = dummy.next;
  //   if(list != dummy){
  //     // System.out.printf("%d",list.data);
  //     builder.append(list.data);
  //     list = list.next;
  //   }
  //   while(list!=dummy){
  //     // System.out.printf(" %d",list.data);
  //     builder.append(' ').append(list.data);
  //     list = list.next;
  //   }
  //   System.out.println(builder);
  //   // System.out.println();
  // }
}
//listの構造体的役割
class List{
  public int data;
  public List next;
  public List previous;

  public List(){}
    public List(int n){
      this.data = n;
    }
  }

