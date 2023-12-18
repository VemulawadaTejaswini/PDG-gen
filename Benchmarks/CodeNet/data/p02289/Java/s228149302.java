import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		BinaryTree<String> bt = new BinaryTree<String>();
		bt.insert(0, "zero");
		while(true){
			String str = scr.nextLine();
			if(str.equals("extract")) System.out.println(bt.extractMax().value);
			else if(str.equals("end")) break;
			else bt.insert(Integer.parseInt(str.split(" ")[1]), str.split(" ")[1]);
		}
		scr.close();
	}

}


class BinaryTree<T> {
	public int key;
	public T value;
	public BinaryTree<T> left;
	public BinaryTree<T> right;
	public BinaryTree<T> parent;

	BinaryTree(){
		this.value = null;
		this.key = 0;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	BinaryTree(int key, T value, BinaryTree<T> p){
		this.value = value;
		this.key = key;
		this.left = null;
		this.right = null;
		this.parent = p;
	}
	
	public void insert(int key, T value){
		if(this.parent == null && this.value == null){
			this.value = value;
			this.key = key;
			//this.right = new BinaryTree<T>(key, value, this);
			return;
		}else if(this.key > key){
			if(this.left == null) this.left = new BinaryTree<T>(key, value, this);
			else this.left.insert(key, value);
		}else if(this.key < key){
			if(this.right == null) this.right = new BinaryTree<T>(key, value, this);
			else this.right.insert(key, value);
		}else{
			this.value = value;
		}
		return;
	}
	public BinaryTree<T> extractMax(){
		if(this.parent == null) {
			if(this.right == null) {
				if(this.left == null) {
					System.err.println("This tree is enpty");
					return null;
				}else return this.left.extractMax();
			}else return this.right.extractMax();
		}
		if(this.right == null){
			if(this.left == null){
				if(this.parent.left == this) this.parent.left = null;
				else/* if(this.parent.right == this) */this.parent.right = null;
			}else{
				if(this.parent.right == this) this.parent.right = this.left;
				else/* if(this.parent.left == this) */this.parent.left = this.left;
				this.left.parent = this.parent;
			}
			return this;
		}else{
			return this.right.extractMax();
		}
	}

}