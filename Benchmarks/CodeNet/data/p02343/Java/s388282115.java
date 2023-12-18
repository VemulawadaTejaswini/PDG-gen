
public class Main {
int name;
UFT_Node next;
int rank;

public Main(int new_name){
	this.name = new_name;
	this.rank =0;
	this.next = this;
	}

public Main getRep(){
	UFT_Node output;
	if (this.next.name == this.name)
		return this;
	else output = this.next.getRep();
	this.next = output; 
	return output;
}

}

